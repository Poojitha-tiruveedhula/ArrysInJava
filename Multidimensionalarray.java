class Multidimensionalarray
{
public static void main(String[] args)
{
int num[][]=new int[3][4];
for(int i=0;i<3;i++)
{
for(int j=0;j<4;j++)
{
num[i][j]=(int)(Math.random()*3);
System.out.println(num[i][j]);
}}
for(int i=0;i<3;i++)
{
for(int j=0;j<4;j++)
{
System.out.print(num[i][j]+" ");
}
System.out.println();
}}}
