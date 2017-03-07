
public class Iterative {

	public float[][] multiply(float[][] a,float[][] b)
	{
		float[][] c=new float[a.length][b[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				c[i][j]=0;
			}
		}
	
		if(a[0].length!=b.length)
		{
			System.out.println("Matrices can not be multiplied");
			return null;
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				for(int k=0;k<a[0].length;k++)
				{
					c[i][j]+= a[i][k]*b[k][j];
				}
			}
			
		}
	
		return c;
	}
}
