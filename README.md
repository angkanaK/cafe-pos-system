# ☕ Booklyn Cafe - POS System (Java)

ระบบบริหารจัดการหน้าร้านคาเฟ่จำลอง พัฒนาด้วยภาษา **Java** ที่เน้นความถูกต้องของ Logic การคำนวณเงินและระบบสิทธิพิเศษสำหรับลูกค้า

## ✨ คุณสมบัติของระบบ (Features)
* 🛒 **Menu Selection:** รองรับการสั่งอาหารและเครื่องดื่ม (Latte, Pizza, Hamburger)
* 🍪 **Reward System:** สั่ง Latte ครบ 5 แก้ว รับคุกกี้ฟรี 1 ชิ้น!
* 💸 **Smart Discount:** ส่วนลด 10% อัตโนมัติเมื่อยอดซื้อเกิน 600 บาท
* 🧾 **Tax Calculation:** คำนวณ VAT 7% จากยอดสุทธิหลังหักส่วนลดอย่างแม่นยำ
* 🔢 **Decimal Precision:** แสดงผลทศนิยม 2 ตำแหน่งตามมาตรฐานบัญชี

## 🛠️ โครงสร้างโค้ด (Project Structure)
* `CafeSystem.java`: ไฟล์หลักที่ควบคุมการทำงานของระบบ (Main Logic & Input)
* `Menu.java`: คลาสสำหรับจัดการข้อมูลเมนูอาหาร (Object-Oriented Design)

## 🚀 วิธีการใช้งาน (How to Run)
1. ตรวจสอบว่าเครื่องมี Java ติดตั้งอยู่
2. Compile ไฟล์: `javac CafeSystem.java`
3. รันโปรแกรม: `java CafeSystem`

อัปเกรดล่าสุด (New in v2.0)
🛠️ Admin Mode (Dynamic Inventory): ผู้ดูแลร้านสามารถเพิ่มเมนูใหม่ (ชื่อ, ราคา, ประเภท) เข้าสู่ระบบได้ทันทีผ่าน Console โดยไม่ต้องแก้ไข Source Code

🔄 Flexible Ordering Loop: ระบบรับออเดอร์แบบต่อเนื่อง (Nested Loop) ช่วยให้สั่งอาหารได้หลายรายการในครั้งเดียวจนกว่าจะกดยืนยัน (OK)

📂 ArrayList Integration: จัดการข้อมูลเมนูแบบ Dynamic ด้วย ArrayList รองรับการขยายตัวของรายการอาหารได้ไม่จำกัด

💻 Technical Highlights
Logic Flow: การจัดการ Buffer ของ Scanner (แก้ปัญหาช่องว่างหลัง nextInt) เพื่อการรับค่าที่แม่นยำ

Clean Logic: การใช้ equalsIgnoreCase เพื่อให้ระบบไม่ Error แม้ผู้ใช้จะพิมพ์ตัวพิมพ์เล็กหรือใหญ่

Object Mapping: เชื่อมโยงข้อมูลจาก Input ไปสร้างเป็น Object ใน Menu.java ได้อย่างสมบูรณ์

---
*พัฒนาโดย: Booklyn (SU Computer Science)* 💻🎨