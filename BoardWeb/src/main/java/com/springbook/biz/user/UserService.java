package com.springbook.biz.user;

import com.springbook.biz.user.UserVO;

/**
 * Created by Namsoo on 2017. 10. 29..
 */
public interface UserService {
    //글 상세 조회
    UserVO getUser(UserVO vo);
}
