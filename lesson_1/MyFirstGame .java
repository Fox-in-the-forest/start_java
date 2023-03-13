public class MyFirstGame {
    public static void main(String[] args) {
        int computersNum = 33;
        if (computersNum > 0 && computersNum <= 100) {
            int peoplesNum = 50;
            while (peoplesNum != computersNum && computersNum > 50) {
                if (peoplesNum < computersNum) {
                    System.out.println("число " + peoplesNum + " меньше того, " +
                            "что загадал компьютер");
                    peoplesNum += 10;
                } else {
                    System.out.println("число " + peoplesNum + " больше того, " +
                            "что загадал компьютер ");
                    peoplesNum--;
                }
            }
            while (peoplesNum != computersNum) {
                if (peoplesNum > computersNum) {
                    System.out.println("число " + peoplesNum + " больше того, " +
                            "что загадал компьютер ");
                    peoplesNum -= 10;
                    if(peoplesNum == 0){
                        peoplesNum++;
                    }
                } else {

                    System.out.println("число " + peoplesNum + " меньше того, " +
                            "что загадал компьютер ");
                    peoplesNum++;
                }
            }
            if (peoplesNum == computersNum) {
                System.out.println("число " + peoplesNum + " Вы победили!");
            }
        } else {
            System.out.println("Число не в диапазоне");
        }
    }
}