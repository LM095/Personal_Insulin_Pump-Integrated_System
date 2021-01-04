package LD_InsulinPump;

import java.util.Random;

public class PumpRandomImpl implements Pump, CheckHardware
{
    private Random randomCheckHWGenerator;
    private int bound = 1000;

    public PumpRandomImpl(Random randomCheckHWGenerator)
    {
        this.randomCheckHWGenerator = randomCheckHWGenerator;
    }

    @Override
    public void collectInsulin(Integer insulinToCollect) throws HardwareIssueException {
        if(!isHardwareWorking())
            throw new HardwareIssueException("Pump Hardware Issue");
    }

    @Override
    public boolean isHardwareWorking()
    {
        int randomNum = randomCheckHWGenerator.nextInt(bound);

        if (randomNum == 0 || (randomNum > 42 && randomNum < 53))
            return false;

        return true;
    }
}
