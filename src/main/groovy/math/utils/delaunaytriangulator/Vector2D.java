package math.utils.delaunaytriangulator;

public class Vector2D {

    public double x;
    public double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D sub(Vector2D vector) {
        return new Vector2D(this.x - vector.x, this.y - vector.y);
    }

    public Vector2D add(Vector2D vector) {
        return new Vector2D(this.x + vector.x, this.y + vector.y);
    }

    public Vector2D mult(double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    /**
     * Computes the magnitude or length of this.
     *
     * @return The magnitude of this
     */
    public double mag() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    /**
     * Computes the dot product of this and the given vector.
     *
     * @param vector
     *            The vector to be multiplied by this
     * @return A new instance holding the result of the multiplication
     */
    public double dot(Vector2D vector) {
        return this.x * vector.x + this.y * vector.y;
    }

    /**
     * Computes the 2D pseudo cross product Dot(Perp(this), vector) of this and
     * the given vector.
     *
     * @param vector
     *            The vector to be multiplied to the perpendicular vector of
     *            this
     * @return A new instance holding the result of the pseudo cross product
     */
    public double cross(Vector2D vector) {
        return this.y * vector.x - this.x * vector.y;
    }

    @Override
    public String toString() {
        return "Vector2D[" + x + ", " + y + "]";
    }
}
