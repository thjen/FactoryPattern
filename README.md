# Factory Pattern

- Bạn nghĩ tới mẫu thiết kế nhà máy Factory khi: Bạn sử dụng `toán tử new` để tạo đối tượng OracleConnection. Sau đó lại sử dụng tiếp toán tử `new` để tạo đối tượng SQLServerConnection, và sau đó là MySQLConnection. Nói cách khác, bạn đã sử dụng toán tử `new để tạo nhiều đối tượng thuộc các lớp khác nhau`, điều này làm mã nguồn của bạn trở nên lớn hơn và bạn buộc phải lặp lại điều này nhiều lần trong toàn bộ mã nguồn. Sau đó bạn đưa đoạn mã đó vào trong một phương thức. Bởi vì yêu cầu vẫn còn có thể thay đổi nhanh chóng, nên cách tốt nhất là `đóng gói chúng vào một đối tượng nhà máy factory.` Theo cách làm này, bạn đã `tách phần mã dễ thay đổi riêng biệt ra và giúp phần mã nguồn còn lại giữ vững nguyên tắc “đóng cho việc sửa đổi”.`

- Chúng ta có thể cải tiến source code như sau để cho phép lớp con quyết định cách thể hiện, việc này dẫn đến sự uyển chuyển hơn:

> Chúng ta sẽ tạo 1 lớp là abstract tên là ConnectionFactory. Sau đó trong FirstFactory chúng ta thực hiện implements ConnectionFactory và định nghĩa createConnection, bạn cũng có thể tạo thêm SecondFactory và ThirdFactory và chỉ cần thực hiện implements ConnectionFactory.

```
public abstract class ConnectionFactory { 

	public ConnectionFactory() {
	}	
	
	protected abstract Connection createConnection(); 
}
```

```
public class FirstFactory extends ConnectionFactory {
    protected String type;

    public FirstFactory(String t) {
        this.type = t;
    }
    
    @Override
    public Connection createConnection() {
        if (type .equals("Oracle")) {
            return new OracleConnection();
        } else if (type.equals("SQL Server")) {
            return new SQLServer();
        } else {
            return new MySqlConnect();
        }
    }
}
```
