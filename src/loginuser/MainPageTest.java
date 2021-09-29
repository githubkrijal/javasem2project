package loginuser;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MainPageTest {
    @Test
    void insert_Test() {
        DbOperation db = new DbOperation();
        String query = "insert into registration_tbl(fname,lname,username,email,gender,password,cpassword)values('" + 4 + "','" + 2 + "','" + 2 + "','" + 2 + "','" + 2 + "','" + 2 + "','" + 2 + "')";
        int result = db.insert(query);
        assertEquals(1, result);

    }

    @Test
    void select_Test() throws SQLException {
        DbOperation db = new DbOperation();
        String username = "1";
        String query = "select * from registration_tbl where username='" + username + "'";
        ResultSet rs = db.select(query);
        int count = rs.getRow();
        assertEquals(0, count);
    }

    @Test
    void delete_Test() {
        DbOperation db = new DbOperation();
        String sql = "DELETE FROM product WHERE id='" + 9 + "'";
        int rowsDeleted = db.executeDelete(sql);
        assertEquals(1, rowsDeleted);
    }

    @Test
    void update_Test() {
        String query = "update registration_tbl set fname='" + 2 + "' where username='" + 2 + "'";
        DbOperation db = new DbOperation();
        int rs = db.Update(query);
        assertEquals(1, rs);
    }

    @Test
    void Test_user_dataCorrect() {
        userData data = new userData("Krijal", "Shrestha", "krijal9", "krijal@gmail.com", "Male", "krijal", "krijal");
        assertEquals("krijal9", data.getUsername());
    }

    @Test
    void Test_user_dataIncorrect() {
        userData data = new userData("krijal", "shrestha", "kri99", "krijal@gmail.com", "male", "pass", "pass");
        assertEquals("krii", data.getUsername());
    }

    @Test
    void Test_user_dataCorrect2() {
        userData data = new userData("krijal", "shrestha", "kri99", "krijal@gmail.com", "male", "pass", "pass");
        assertEquals("", data.getUsername());

    }

    @Test
    void Test_reg() {
        String pass_test = "key";
        String cpass_test = "key";
        registrationPage reg = new registrationPage();
        boolean result = reg.reg_test(pass_test, cpass_test);
        assertTrue(result);
    }

    @Test
    void Test_login1(){
        String username="krijal";
        String password="k123";
        LoginPage reg=new LoginPage();
        boolean result=reg.log_test(username,password);
        assertTrue(result);
    }
}
