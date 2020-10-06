public class HardDisk {
     private int amount;
     private int memory;

     HardDisk(){
         setAmount(amount);
     }

     HardDisk(int memory){
         setMemory(memory);
     }

     int getMemory(){
         return memory;
     }

    public void setAmount(int HD) {
        this.amount = HD;
    }

     int getAmount() {
         return amount;
     }

    public void setMemory(int memory) {
        this.memory = memory;
    }

     public void setAmount(){
         if (amount >= 0 && amount <= 1000) {
             this.amount = amount;
         }else{
             System.out.println("输入错误");
         }
     }
    public void setMemory(){
        if (memory >= 0 && memory <= 10000) {
            this.memory = memory;
        }else{
            System.out.println("输入错误");
        }
    }
}

