package flab.emojeomo.common;

import org.springframework.http.HttpStatus;

public class ResponseDto {
    private HttpStatus status;
    private String message;
    private Object data;

    public static class Builder {
        private HttpStatus status;
        private String message;

        private Object data = null;

        public Builder(HttpStatus status, String message) {
            this.status = status;
            this.message = message;
        }

        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        public ResponseDto build() {
            return new ResponseDto(this);
        }
    }

    private ResponseDto(Builder builder) {
        status = builder.status;
        message = builder.message;
        data = builder.data;
    }
}
