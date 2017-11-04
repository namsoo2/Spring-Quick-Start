package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Namsoo on 2017. 10. 29..
 */
@Repository()
public class BoardDAOSpring {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values((select nvl(max(seq), 0)+1 from board), ?, ?, ?)";
    private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
    private final String BOARD_DELETE = "delete board where seq=?";
    private final String BOARD_GET = "select * from board where seq=?";
    private final String BOARD_LIST = "select * from board order by seq desc";

    //글 등록
    public void insertBoard(BoardVO vo) {
        System.out.println("===> JDBC insertBoard() 기능처리");
        jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
    }


    //글 수정
    public void updateBoard(BoardVO vo) {
        System.out.println("===> JDBC updateBoard() 기능처리");
        jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
    }


    //글 삭제
    public void deleteBoard(BoardVO vo) {
        System.out.println("===> JDBC deleteBoard() 기능처리");
        jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
    }


    //글 상세 조회
    public BoardVO getBoard(BoardVO vo) {
        System.out.println("===> JDBC getBoard() 기능처리");
        //TODO 이건 무슨 코드?
        Object[] args = {vo.getSeq()};
        return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
    }


    //글 목록 조회
    public List<BoardVO> getBoardList(BoardVO vo) {
        System.out.println("===> JDBC getBoardList() 기능처리");
        return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
    }


    class BoardRowMapper implements RowMapper<BoardVO> {
        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
            BoardVO board = new BoardVO();
            board.setSeq(rs.getInt("SEQ"));
            board.setTitle(rs.getString("TITLE"));
            board.setWriter(rs.getString("WRITER"));
            board.setContent(rs.getString("CONTENT"));
            board.setRegDate(rs.getDate("REGDATE"));
            board.setCnt(rs.getInt("CNT"));
            return board;
        }
    }

}


//    create table users(id varchar2(8) primary key, password varchar2(8), name varchar2(20), role varchar2(5));
//
//        insert into users values('test', 'test1', '관리자', 'Admin');
//        insert into users values('user', 'user1', '홍길동', 'user');
//
//        create table board(seq number(5) primary key, title varchar(200), writer varchar(20), content varchar(2000), regdate date default sysdate, cnt number(5) default 0);
//
//        insert into board(seq, title, writer, content) values(1, '가입인사', '관리자', '잘 부탁...');