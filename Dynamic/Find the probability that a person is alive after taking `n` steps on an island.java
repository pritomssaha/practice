	public static double aliveProbability(int N, int x, int y, int n, Map<String, Double> dp){
		if(n==0)
			return 1.0;
		String key=x+"|"+y+"|"+n;
		if(!dp.containsKey(key)){
			double p=0.0;
			if(x>0)
				p+=0.25*aliveProbability(N,x-1, y,n-1, dp);
			if(x<N-1)
				p+=0.25*aliveProbability(N,x+1, y,n-1, dp);
			if(y>0)
				p+=0.25*aliveProbability(N,x, y-1,n-1, dp);
			if(y<N-1)
				p+=0.25*aliveProbability(N,x, y+1,n-1, dp);
			
			dp.put(key, p);
		}
		return dp.get(key);
		
	}
	
