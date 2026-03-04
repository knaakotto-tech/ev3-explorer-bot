package tech.knaakotto.ev3explorer.drive;

public interface DriveSystem {

    void forward(double speed);
    void turn (double speed);
    void stop ();
}
