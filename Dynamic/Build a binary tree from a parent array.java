	public static Node createTree(int[] parent){
		
		//create a HashMap
		Map<Integer, Node>map =new HashMap<>();
		//create a root node
		Node root=null;
		for(int i=0;i<parent.length;i++){
			//map i-->Node(i)
			/*
			0-->0
			   / \
			1-->1
			   / \
			2-->2
			   / \
			*/
			map.put(i, new Node(i));
		}
		for(int i=0;i<parent.length;i++){
			//if current element is -1 then it is root
			if(parent[i]==-1)
				root=map.get(i);
			else{
				//get the parent node of the current element
				Node parentNode=map.get(parent[i]);
				//if the current element node does not have left child, left child will be Node of the current index
				if(parentNode.left==null)
					parentNode.left=map.get(i);
				else
				//right child will be Node of the current index
					parentNode.right=map.get(i);
			}
		}
		return root;
		

	}