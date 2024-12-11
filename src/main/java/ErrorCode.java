public enum ErrorCode {
    BAD_REQUEST(400, "This is a bad request"),
    UNAUTHORIZED(401, ""),
    FORBIDDEN(403, ""),
    SERVER_ERROR(500, "Server error"),
    SERVICE_UNAVAILABLE(503, "");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
            this.code = code;
            this.message = message;
    }

    int getCode(){
        return this.code;
    }

    String getMessage(){
        return this.message;
    }
}
