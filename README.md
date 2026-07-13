# EMCTech - EMC Kỹ thuật

Đây là một plugin phụ trợ cho Slimefun4, tích hợp EMC2 với EquivalencyTech.

Người chơi có thể sử dụng Máy giải cấu để phân hủy vật phẩm Vanilla hoặc Slimefun để nhận giá trị EMC.  
Thông qua Máy tái cấu, người chơi có thể dùng EMC để tái tạo lại vật phẩm đã phân hủy.

Ngoài ra, nếu máy chủ cài đặt plugin Networks, người chơi có thể sử dụng Máy tái cấu EMC Mạng để đưa vật phẩm tái tạo trực tiếp vào mạng lưới.

## Tải xuống

Nhấp vào đây để tải EMCTech: [Tải EMCTech](https://builds.guizhanss.net/SlimefunGuguProject/EMCTech/master)

<p align="center">
  <a href="https://github.com/SlimefunGuguProject/EMCTech/actions/workflows/maven.yml">
    <img src="https://github.com/SlimefunGuguProject/EMCTech/actions/workflows/maven.yml/badge.svg" alt="Java CI"/>
  </a>
  <a href="https://builds.guizhanss.net/SlimefunGuguProject/EMCTech/master">
    <img src="https://builds.guizhanss.net/f/SlimefunGuguProject/EMCTech/master/badge.svg" alt="Build status"/>
  </a>
</p>

## Lệnh & Quyền hạn

Tất cả lệnh đều bắt đầu bằng `/emctech` hoặc `/emc`.  
Danh sách dưới đây sử dụng `/emc` để minh họa.

`<>` là tham số bắt buộc, `[]` là tham số tùy chọn

| Lệnh | Mô tả | Quyền hạn |
| --- | --- | ------- |
| `/emc emc` | Hiển thị EMC của bạn | Không |
| `/emc viewemc <tên_người_chơi>` | Xem EMC của người chơi | `EMCTech.Admin` |
| `/emc addemc <tên_người_chơi> <số_lượng>` | Thêm EMC cho người chơi | `EMCTech.Admin` |
| `/emc setemc <tên_người_chơi> <số_lượng>` | Đặt EMC cho người chơi | `EMCTech.Admin` |

## PlaceholderAPI

- `%emctech_current_emc%` - Giá trị EMC hiện tại của người chơi
- `%emctech_amount_learned_vanilla%` - Số lượng vật phẩm Vanilla đã mở khóa
- `%emctech_amount_learned_slimefun%` - Số lượng vật phẩm Slimefun đã mở khóa
