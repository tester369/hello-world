import java.io.*;
import java.util.*;


class testing {
  int one;
  public testing() {
    this.one = 1;
  }
}

public static void main(String args[]) {
  testing box = new testing();

  box.one++;
  Systm.out.println(box.one);
}


