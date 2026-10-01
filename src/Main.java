void main() {

    Vector3d A = new Vector3d(5, 6, 3);
    Vector3d B = new Vector3d(5, 6, -3);
    System.out.println("vector A: " + A);
    System.out.println("vector B: " + B);
    System.out.println("A + B: " + A.add(B));
    System.out.println("A - B: " + A.sub(B));
    System.out.println("A * B: " + A.scalardob(B));
    System.out.println("A * 5: " + A.multiple(5));
    System.out.println("len A: " + A.lenVector());
    System.out.println("len B: " + B.lenVector());
    System.out.println("what longer: " + A.whatlonger(B));
    System.out.println("equals: " + A.equal(B));

}
