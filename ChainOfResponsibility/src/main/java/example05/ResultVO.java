package example05;

public class ResultVO {

    private Boolean success;
    private String massage;

    public ResultVO(Boolean success) {
        this.success = success;
    }

    public ResultVO(Boolean success, String massage) {
        this.success = success;
        this.massage = massage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
