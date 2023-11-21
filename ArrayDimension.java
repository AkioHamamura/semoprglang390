abstract class ArrayDimension extends BinaryOp
{
  public EvalResult eval()
  {
    return null;
  }

  public void print(int indent, int depth)
  {
    getRight().print(depth+1);
    System.out.printf("%"+(depth+1)+"sDIMENSION\n", "");
    getLeft().print(depth+1);
  }
}