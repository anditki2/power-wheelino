package com.powerwheelino;

public interface JoystickMovedListener {
        public void OnMoved(int pan, int tilt);
        public void OnReleased();
        public void OnReturnedToCenter();
}