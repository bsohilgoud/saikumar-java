public class AccessModifier {
    private String password = "original_password";

    public String getPassword() {
        return password;
    }

    private void changePassword(String newPassword){
        // as -> change password
        //
        //
        //  50 lines
        //
        //
        password = newPassword;
    }

    public void changePassword(String oldPassword, String newPassword) throws Exception {
        if(oldPassword.equals(this.password)){
            System.out.println("Changing.. password");
            changePassword(newPassword);
        } else {
            throw new Exception("Invalid Old Password");
        }
    }

    public void changePassword(int OTP, String newPassword) throws Exception {
        if(OTP == 12345){
            System.out.println("Changing.. password");
            changePassword(newPassword);
        } else {
            throw new Exception("Invalid OTP");
        }
    }


}
