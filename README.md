☕ Booklyn Cafe - POS System (Java)
ระบบบริหารจัดการหน้าร้านคาเฟ่จำลอง พัฒนาด้วยภาษา Java ที่เน้นความถูกต้องของ Logic การคำนวณเงินและระบบสิทธิพิเศษสำหรับลูกค้า

✨ คุณสมบัติของระบบ (Features)
🛒 Menu Selection: รองรับการสั่งอาหารและเครื่องดื่ม (Latte, Pizza, Hamburger)

🍪 Reward System: สั่ง Latte ครบ 5 แก้ว รับคุกกี้ฟรี 1 ชิ้น!

💸 Smart Discount: ส่วนลด 10% อัตโนมัติเมื่อยอดซื้อเกิน 600 บาท

🧾 Tax Calculation: คำนวณ VAT 7% จากยอดสุทธิหลังหักส่วนลดอย่างแม่นยำ

🔢 Decimal Precision: แสดงผลทศนิยม 2 ตำแหน่งตามมาตรฐานบัญชี

💎 แนวคิดการออกแบบ (Design Concepts & Updates)
v3.0 Refactoring (Latest)
Modular Programming: แยกการทำงานออกเป็น Method ย่อย (e.g., processOrder, checkOut, addNewMenu) เพื่อให้โค้ดอ่านง่ายและบำรุงรักษาได้ง่าย (Maintainability)

Static State Management: จัดการสถานะตัวแปร total และ latteCount แบบ Static เพื่อให้ทุกส่วนของโปรแกรมเข้าถึงข้อมูลชุดเดียวกันได้อย่างถูกต้อง

Encapsulation: ออกแบบคลาส Menu ให้เก็บรักษาข้อมูล (Data Hiding) และแสดงผลผ่าน Method showInfo() ตามหลักการ OOP

v2.0 Updates
🛠️ Admin Mode: เพิ่มเมนูใหม่ (ชื่อ, ราคา, ประเภท) ได้ทันทีผ่าน Console โดยไม่ต้องแก้ไข Source Code

🔄 Flexible Ordering Loop: ระบบรับออเดอร์ต่อเนื่อง (Nested Loop) สั่งได้หลายรายการจนกว่าจะพิมพ์ "OK"

📂 ArrayList Integration: จัดการข้อมูลเมนูแบบ Dynamic รองรับการขยายตัวของรายการอาหารได้ไม่จำกัด

📊 ผังการทำงาน (Logic Flow)
Initialize: โหลดเมนูพื้นฐานเข้าสู่ระบบ (ArrayList)

Main Loop: รับคำสั่งจากผู้จัดการร้าน (1. Order | 2. Add | 3. Exit)

Execution: เรียกใช้ Method เฉพาะทางตามที่ได้รับมอบหมาย

Finalize: คำนวณส่วนลดตามเงื่อนไข (Conditional Logic) และพิมพ์ใบเสร็จ (Formatting Output)

💻 Technical Highlights
Buffer Control: การจัดการ Buffer ของ Scanner (แก้ปัญหาช่องว่างหลัง nextInt) เพื่อการรับค่าที่แม่นยำ

Clean Logic: การใช้ equalsIgnoreCase เพื่อความยืดหยุ่นในการรับ Input จากผู้ใช้งาน

Object Mapping: เชื่อมโยงข้อมูลจาก Input ไปสร้างเป็น Object ใน Menu.java ได้อย่างสมบูรณ์

🛠️ โครงสร้างโปรเจกต์ (Project Structure)
CafeSystem.java: ไฟล์หลักที่ควบคุมการทำงานของระบบ (Main Logic & Input)

Menu.java: คลาสสำหรับจัดการข้อมูลเมนูอาหาร (Object-Oriented Design)

🚀 วิธีการใช้งาน (How to Run)
ตรวจสอบว่าเครื่องมี Java ติดตั้งอยู่

Compile ไฟล์: javac CafeSystem.java

รันโปรแกรม: java CafeSystem

พัฒนาโดย: Booklyn (SU Computer Science) 💻🎨