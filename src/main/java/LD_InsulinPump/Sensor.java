package LD_InsulinPump;

public interface Sensor {
    Float runMeasurement() throws HardwareIssueException;
}
