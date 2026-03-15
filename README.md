👓 Hệ Thống Bán Kính Mắt Trực Tuyến
📌 Giới thiệu

Hệ Thống Bán Kính Mắt Trực Tuyến (Online Eyewear Ordering System) là một ứng dụng web cho phép khách hàng mua kính mắt một cách thuận tiện thông qua Internet. Hệ thống hỗ trợ nhiều hình thức đặt hàng khác nhau như:

Mua kính có sẵn

Đặt trước (Pre-order) khi sản phẩm hết hàng

Đặt làm tròng kính theo đơn kính (Prescription)

Trong thực tế, việc mua kính tại cửa hàng thường gây bất tiện vì khách hàng phải di chuyển, chờ tư vấn hoặc đo mắt, và bị giới hạn lựa chọn theo tồn kho của cửa hàng. Hệ thống này giúp giải quyết các vấn đề đó bằng cách cung cấp nền tảng trực tuyến để khách hàng dễ dàng tìm kiếm, so sánh và đặt mua kính.

Ngoài ra, hệ thống còn hỗ trợ các bộ phận vận hành như nhân viên bán hàng, bộ phận xử lý đơn hàng, quản lý và quản trị hệ thống.

🎯 Mục tiêu hệ thống

Xây dựng nền tảng mua kính trực tuyến tiện lợi cho khách hàng.

Hỗ trợ nhiều loại đơn hàng:

Mua kính có sẵn

Đặt trước sản phẩm

Đặt kính theo đơn kính (Prescription)

Giúp khách hàng tìm kiếm, lọc và so sánh sản phẩm dễ dàng.

Hỗ trợ quy trình xử lý đơn hàng nội bộ.

Hỗ trợ quản lý sản phẩm, người dùng và doanh thu.

👥 Các vai trò trong hệ thống
1️⃣ Customer (Khách hàng)

Khách hàng có thể:

Duyệt danh mục sản phẩm:

Gọng kính

Tròng kính

Lens

Các dịch vụ liên quan

Tìm kiếm và lọc sản phẩm theo:

Giá

Kiểu gọng

Kích thước

Màu sắc

Xem chi tiết sản phẩm:

Hình ảnh 2D / 3D

Thông số kỹ thuật

Giá bán

Đặt hàng với nhiều loại đơn:

Mua sản phẩm có sẵn

Pre-order

Mua kính + làm tròng theo đơn kính

Quản lý:

Giỏ hàng

Thanh toán

Lịch sử đơn hàng

Yêu cầu đổi/trả

Quản lý thông tin tài khoản.

2️⃣ Sales / Support Staff (Nhân viên bán hàng / hỗ trợ)

Nhân viên hỗ trợ có thể:

Tiếp nhận và xử lý đơn hàng.

Kiểm tra thông tin đơn kính (prescription).

Liên hệ khách hàng khi cần điều chỉnh thông số.

Xác nhận đơn hàng.

Chuyển đơn cho bộ phận vận hành.

Xử lý đơn pre-order.

Giải quyết:

Khiếu nại

Đổi trả

Bảo hành

Hoàn tiền.

3️⃣ Operations Staff (Nhân viên vận hành)

Nhân viên vận hành chịu trách nhiệm:

Đóng gói sản phẩm.

Tạo vận đơn và cập nhật trạng thái giao hàng.

Xử lý đơn pre-order:

Nhận hàng

Cập nhật kho

Chuẩn bị giao hàng.

Xử lý đơn prescription:

Gia công tròng kính

Lắp kính.

Cập nhật trạng thái xử lý đơn hàng.

4️⃣ Manager (Quản lý)

Quản lý có thể:

Quản lý chính sách:

Mua hàng

Đổi trả

Bảo hành.

Quản lý sản phẩm:

Cấu hình thuộc tính sản phẩm

Quản lý biến thể (size, màu, kiểu).

Quản lý giá:

Gọng kính

Tròng kính

Dịch vụ

Combo (gọng + tròng).

Quản lý khuyến mãi.

Quản lý nhân sự hệ thống.

Theo dõi doanh thu và báo cáo.

5️⃣ System Admin (Quản trị hệ thống)

System Admin chịu trách nhiệm:

Quản lý và cấu hình hệ thống.

Quản lý quyền truy cập.

Bảo mật hệ thống.

Bảo trì và nâng cấp hệ thống.

⭐ Chức năng nâng cao (Optional)

Hệ thống có thể hỗ trợ thêm các tính năng nâng cao như:

Virtual Glasses Try-On

Cho phép người dùng thử kính trực tuyến bằng camera hoặc ảnh khuôn mặt.

Gợi ý kính phù hợp

Hệ thống có thể:

Phân tích khuôn mặt

Đo kích thước khuôn mặt

Gợi ý kiểu gọng kính phù hợp.

🏗 Kiến trúc hệ thống (gợi ý)

Hệ thống có thể được xây dựng theo mô hình:

MVC (Model – View – Controller)

Các thành phần:

Model

User

Product

Order

Prescription

Cart

Payment

View

Giao diện người dùng

Trang sản phẩm

Trang thanh toán

Trang quản lý

Controller

ProductController

OrderController

UserController

AdminController

🛠 Công nghệ sử dụng

Java

JSP / Servlet

HTML / CSS / JavaScript

MySQL

JDBC

Apache Tomcat

📂 Cấu trúc thư mục (gợi ý)
OnlineEyewearSystem
│
├── src
│   ├── controller
│   ├── model
│   ├── dao
│   ├── service
│
├── web
│   ├── jsp
│   ├── css
│   ├── js
│
├── database
│   └── database.sql
│
└── README.md
