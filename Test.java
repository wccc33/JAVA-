public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        HardDisk HD = new HardDisk();
        cpu.setSpeed(2200);
        HD.setAmount(200);
        cpu.setType(7);
        cpu.setFre(4);
        HD.setMemory(512);
        PC pc = new PC(cpu);
        pc.setHardDisk(HD);
        pc.setCPU(cpu);
        pc .show();

    }
}

