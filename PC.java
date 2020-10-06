public class PC {
    private CPU cpu;
    private HardDisk HD;
    PC(CPU cpu){
        setCPU(cpu);
    }
    PC(HardDisk HD){
        setHardDisk(HD);
    }

 void setCPU(CPU cpu) {
     this.cpu = cpu;
}
 void setHardDisk(HardDisk HD) {
     this.HD = HD;
 }
void show(){
     System.out.println("CPU速度:"+cpu.getSpeed());
     System.out.println("硬盘容量:"+HD.getAmount());
     System.out.println("型号:"+cpu.getType());
     System.out.println("频率:"+cpu.getFre());
    System.out.println("硬盘内存:"+HD.getMemory());
 }
}

