/**
 *
 * @author Bui Thanh Phong
 * class tính tổng hai số
 */
public class MyBigNumber {

    private IRemember iremember;

    //Contrucsion
    public MyBigNumber() {
    }

    public MyBigNumber(final IRemember iremember) {
        this.iremember = iremember;
    }

    /**
     *
     * @author Bui Thanh Phong
     * phương thức tính tổng hai số
     * @param num1 số thứ nhất
     * @param num2 số thứ hai
     * phương thức trả về tổng của hai số
     */
    public String sum(String num1, String num2) {

        String step = ""; //lưu từng bước tính
        String result = ""; //Lưu kết quả
        int length1 = num1.length(); //độ dài chuỗi số 1
        int length2 = num2.length(); //đồ dài chuỗi số 2
        int maxLen = Math.max(length2, length2); //độ dài chuỗi lớn nhất 2 số
        int index1; //vị trí chuỗi num1
        int index2; //vị trí chuỗi num2
        int pos; //biến đếm trong vòng lặp
        int temp = 0; //lưu kết quả số nhớ
        int tempNum = 0;// lưu kết quả số chia lấy dư
        int tempSum = 0; //lưu kết quả cộng từng kí tự
        char char1 = '0'; //kí tự lấy từ chuỗi num1
        char char2 = '0'; //kí tự lấy từ chuỗi num2

        char1 = num1.charAt(0);
        char2 = num2.charAt(0);

        if (char1 == '-' || char2 == '-') {
            throw new NumberFormatException("Ban da nhap sai!");
        }

        for (pos = 0; pos < maxLen; pos++) {

            char1 = pos < length1 ? num1.charAt(length1 - pos - 1) : '0';
            char2 = pos < length1 ? num2.charAt(length2 - pos - 1) : '0';

            if (!(char1 >= '0' && char1 <= '9')) {
                throw new NumberFormatException("Ban da nhap sai so dau tien!");
            }

            if (!(char2 >= '0' && char2 <= '9')) {
                throw new NumberFormatException("Ban da nhap sai so thu hai!");
            }

            index1 = pos < length1 ? (num1.charAt(length1 - pos - 1) - '0') : 0;
            index2 = pos < length2 ? (num2.charAt(length2 - pos - 1) - '0') : 0;
            tempSum = index1 + index2 + temp;
            tempNum = tempSum % 10;

            if (temp == 0) {
                step =  step + "Buoc " + (pos + 1)
                        + ": Lay "
                        + index1 + " cong "
                        + index2 + " =: " + tempSum
                        + " viet " + tempNum
                        + " nho " + tempSum / 10 + "\n";
            } else {
                step =  step + "Buoc " + (pos + 1)
                        + ": Lay "
                        + index1 + " cong "
                        + index2 + "nho " + temp
                        + " =: " + tempSum
                        + " viet " + tempNum
                        + " nho " + tempSum / 10 + "\n";
            }

            temp = tempSum / 10;
            result = tempNum + result;

        }

        if (num1.equals("") || num2.equals("")) {
            throw new NumberFormatException("So khong duoc bo trong!");
        }

        if (num1.equals(null) || num2.equals(null)) {
            throw new NumberFormatException("So khong duoc bo trong!");
        }

        iremember.sendMessage(step);
        return result;
    }
}
