package ru.mirea.practice.s0000001.task4;

public class Stringreader {
    private String numb;

    Stringreader(String numb) {
        this.numb = numb;
    }

    public void setNumb(String numb) {
        this.numb = numb;
    }

    public double[] converter() {
        StringBuilder tempnumb = new StringBuilder();
        int arlen = 1;
        StringBuilder arg = new StringBuilder();
        for (int i = 0;i < numb.length();i++) {
            switch (numb.charAt(i)) {
                case '*' :
                    arlen += 1;
                    tempnumb.append(numb.charAt(i));
                    break;
                case '/' :
                    arlen += 1;
                    tempnumb.append(numb.charAt(i));
                    break;
                case '+' :
                    arlen += 1;
                    tempnumb.append(numb.charAt(i));
                    break;
                case '-' :
                    arlen += 1;
                    tempnumb.append(numb.charAt(i));
                    break;
                default:
                    break;
            }
        }
        double[] args = new double[arlen];
        int cnt = 0;
        for (int i = 0;i < numb.length();i++) {
            if (numb.charAt(i) == '*' | numb.charAt(i) == '/' | numb.charAt(i) == '+' | numb.charAt(i) == '-') {
                args[cnt] = Double.parseDouble(String.valueOf(arg));
                cnt += 1;
                arg.delete(0,arg.length());
            } else {
                if (i == numb.length() - 1) {
                    arg.append(numb.charAt(i));
                    args[cnt] = Double.parseDouble(String.valueOf(arg));
                    break;
                }
                arg.append(numb.charAt(i));
            }
        }
        this.numb = String.valueOf(tempnumb);
        return args;
    }

    public double calculus(double[] args) {
        Markednum temp1 = new Markednum(0.0,false);
        Markednum temp2 = new Markednum(0.0,false);
        final Markednum methods = new Markednum(0.0,false);
        Markednum[] marked = new Markednum[args.length];
        //for (int i = 0;i < numb.length();i++) {
        //System.out.println("act="+numb.charAt(i));
        //}
        for (int i = 0;i < args.length;i++) {
            marked[i] = new Markednum(args[i],false);
        }
        //methods.arrout(marked);
        //System.out.println("start");
        int mara = 0;
        int marb = 0;
        for (int i = 0;i < numb.length();i++) {
            if (numb.charAt(i) == '*') {
                for (int a = i;a > -1;a--) {
                    if (marked[a].getMark() == false) {
                        temp1 = marked[a];
                        mara = a;
                        //System.out.println("num_"+a+"="+temp1);
                        break;
                    }
                }
                for (int b = i + 1;b < args.length;b++) {
                    if (marked[b].getMark() == false) {
                        temp2 = marked[b];
                        //System.out.println("num_"+b+"="+temp2);
                        marb = b;
                        break;
                    }
                }
                //System.out.println("replace:");
                marked[mara].setNum(temp1.getNum() * temp2.getNum());
                marked[marb].setMark(true);
                //System.out.println("numreplaced_"+mara+"="+marked[mara]);
                //System.out.println("nummarked_"+marb+"="+marked[marb]);
            }
            if (numb.charAt(i) == '/') {
                for (int a = i;a > -1;a--) {
                    if (marked[a].getMark() == false) {
                        temp1 = marked[a];
                        mara = a;
                        //System.out.println("num_"+a+"="+temp1);
                        break;
                    }
                }
                for (int b = i + 1;b < args.length;b++) {
                    if (marked[b].getMark() == false) {
                        temp2 = marked[b];
                        //System.out.println("num_"+b+"="+temp2);
                        marb = b;
                        break;
                    }
                }
                //System.out.println("replace:");
                marked[mara].setNum(temp1.getNum() / temp2.getNum());
                marked[marb].setMark(true);
                //System.out.println("numreplaced_"+mara+"="+marked[mara]);
                //System.out.println("nummarked_"+marb+"="+marked[marb]);
            }
        }
        //methods.arrout(marked);
        //System.out.println("*/");
        for (int i = 0;i < numb.length();i++) {
            if (numb.charAt(i) == '+') {
                for (int a = i;a > -1;a--) {
                    if (marked[a].getMark() == false) {
                        temp1 = marked[a];
                        mara = a;
                        //System.out.println("num_"+a+"="+temp1);
                        break;
                    }
                }
                for (int b = i + 1;b < args.length;b++) {
                    if (marked[b].getMark() == false) {
                        temp2 = marked[b];
                        //System.out.println("num_"+b+"="+temp2);
                        marb = b;
                        break;
                    }
                }
                //System.out.println("replace:");
                marked[mara].setNum(temp1.getNum() + temp2.getNum());
                marked[marb].setMark(true);
                //System.out.println("numreplaced_"+mara+"="+marked[mara]);
                // System.out.println("nummarked_"+marb+"="+marked[marb]);
            }
            if (numb.charAt(i) == '-') {
                for (int a = i;a > -1;a--) {
                    if (marked[a].getMark() == false) {
                        temp1 = marked[a];
                        mara = a;
                        //System.out.println("num_"+a+"="+temp1);
                        break;
                    }
                }
                for (int b = i + 1;b < args.length;b++) {
                    if (marked[b].getMark() == false) {
                        temp2 = marked[b];
                        //System.out.println("num_"+b+"="+temp2);
                        marb = b;
                        break;
                    }
                }
                //System.out.println("replace:");
                marked[mara].setNum(temp1.getNum() - temp2.getNum());
                marked[marb].setMark(true);
                //System.out.println("numreplaced_"+mara+"="+marked[mara]);
                //System.out.println("nummarked_"+marb+"="+marked[marb]);
            }
        }
        //methods.arrout(marked);
        //System.out.println("end");
        return methods.nonmarked(marked);
    }
}
