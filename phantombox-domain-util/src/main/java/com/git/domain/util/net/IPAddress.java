package com.git.domain.util.net;

/**
 * IPAddress.
 * <p/>
 * User: dmgcodevil
 * Date: 12/12/12
 * Time: 4:32 PM
 */
public class IPAddress {

    private final int value;

    /**
     * Constructor with parameters.
     *
     * @param value value
     */
    public IPAddress(int value) {
        this.value = value;
    }

    /**
     * Constructor with parameters.
     *
     * @param stringValue ip address
     */
    public IPAddress(String stringValue) {
        String[] parts = stringValue.split("\\.");
        if (parts.length != 4) {
            throw new IllegalArgumentException();
        }
        value =
            (Integer.parseInt(parts[0], 10) << (8 * 3)) & 0xFF000000 |
                (Integer.parseInt(parts[1], 10) << (8 * 2)) & 0x00FF0000 |
                (Integer.parseInt(parts[2], 10) << (8 * 1)) & 0x0000FF00 |
                (Integer.parseInt(parts[3], 10) << (8 * 0)) & 0x000000FF;
    }

    /**
     * Gets octet.
     *
     * @param i num of octet
     * @return octet
     */
    public int getOctet(int i) {

        if (i < 0 || i >= 4) throw new IndexOutOfBoundsException();

        return (value >> (i * 8)) & 0x000000FF;
    }

    /**
     * {@inheritDoc}
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 3; i >= 0; --i) {
            sb.append(getOctet(i));
            if (i != 0) sb.append(".");
        }

        return sb.toString();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IPAddress) {
            return value == ((IPAddress) obj).value;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return value;
    }

    /**
     * Gets value.
     *
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Next.
     *
     * @return IPAddress
     */
    public IPAddress next() {
        return new IPAddress(value + 1);
    }

}
