import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectinExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";

        Connection connection = null;
        try {
            // 데이터베이스 연결 시도
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공!");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패: " + e.getMessage());
        } finally {
            // 연결 종료
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("연결이 종료되었습니다.");
                } catch (SQLException e) {
                    System.out.println("연결 종료 중 예외 발생: " + e.getMessage());
                }
            }
        }
    }
}
