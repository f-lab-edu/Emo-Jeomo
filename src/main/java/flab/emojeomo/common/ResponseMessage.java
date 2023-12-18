package flab.emojeomo.common;
import org.springframework.http.HttpStatus;

public class ResponseMessage {
    public static final String MISSING_ARGUMENT = "필수 데이터 누락";
    public static final String USER_JOIN_SUCCESS = "회원가입 성공";
    public static final String ALREADY_EXIST_USER = "이미 존재하는 회원입니다.";
    public static final String INVALID_USER = "존재하지 않는 회원입니다.";
    public static final String ID_PW_UNMATCHED = "로그인정보가 일치하지 않습니다.";
    public static final String LOGIN_SUCCESS = "로그인 성공";
}
