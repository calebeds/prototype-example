public abstract class Shape implements Cloneable {
    private String id;
    protected String type;
    abstract void draw();
    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}

class Square extends Shape {
    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}

class Circle extends Shape {
    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}