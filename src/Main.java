public class Main {

    public static String tinhHocPhi(int L, int B) {
        if (B < 1)
            return "Invalid error";
        if (L == 1) {
            if (0 < B && B <= 5) {
                long hocphi = 250 * B;
                return hocphi + "k";
            } else if (5 < B && B <= 10) {
                long hocphi = 250 * 5 + 230 * (B - 5);
                return hocphi + "k";
            } else if (10 < B && B <= 15) {
                long hocphi = 250 * 5 + 230 * 5 + 220 * (B - 10);
                return hocphi + "k";
            } else if (B > 15) {
                long hocphi = 250 * 5 + 230 * 5 + 220 * 5 + 200 * (B - 15);
                return hocphi + "k";
            }
        }
        else if (L == 2) {
            if (0 < B && B <= 15) {
                long hocphi = 200 * B;
                return hocphi + "k";
            } else if (B > 15) {
                long hocphi = 200 * 15 + 150 * (B - 15);
                return hocphi + "k";
            }
        }
        else if (L == 3) {
            long hocphi = 150 * B;
            return hocphi + "k";
        }
        return "Invalid error";
    }
    public static void main(String[] args) {

    }
}