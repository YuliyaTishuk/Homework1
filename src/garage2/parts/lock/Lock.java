package garage2.parts.lock;

import garage2.parts.key.IKey;

public class Lock {
    private final IKey key;
    private boolean locked = true;

    public Lock(IKey key) {
        this.key = key;
    }

    public boolean lock(IKey key) {
        if (key == this.key) {
            lock();
            return true;
        } else {
            return false;
        }
    }

    private void lock() {
        locked = true;
    }

    public boolean unlock(IKey key) {
        if (key == this.key) {
            unlock();
            return true;
        } else {
            return false;
        }
    }

    private void unlock() {
        locked = false;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isKeyValid(IKey key) {
        return this.key == key;
    }
}
