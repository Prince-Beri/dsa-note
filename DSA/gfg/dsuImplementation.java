public class dsuImplementation {
    // initilize the size of N with 10^5 + 5;
    static int N = (int) 1e5 + 5;
    // initilize the parent array with size 10^5 + 5;
    static int[] parent = new int[N];
    // initilize the size array with size 10^5 + 5;
    static int[] size = new int[N];
    
    // find the of every component parent.
    int findParent(int x){
        // if x is parent of himself then return x.
        // means x is the parent of that component, so return x.
        if(parent[x] == x){
            return x;
        }
        // otherwise find the parent of that component.
        // (optimization) after finding the parent of each component store the parent of every component in parent array.

        parent[x] = findParent(parent[x]);
        // return parent of that component.
        return parent[x]; 
    }

    void addEgde(int x, int y){
        // find the parent of x.
        x = findParent(x);
        // find the parent of y.
        y = findParent(y);

        // if x and y is not equal means they have different parents and there not belong to same component.
        // so we can create a edge between them.
        if(x != y){
            // if size of x is greate then size of y component then make x the parent of y component.
            // (optimization) because it help us to optimize on the bases of hight.
            if(size[x] > size[y]){
                // make the x as a parent of y.
                parent[y] = x;
                // increment the size of x by current size of y (size[y]).
                size[x] += size[y];

            }else{
                // otherwise make the y as a parent of x.
                // Note: else handle both less then (<) and (==) cases.
                parent[x] = y;
                // increment the size of y by current size of x (size[x]).
                size[y] += size[x];
            }
        }
    }

    public boolean checkIfBothNodesHaveSameParent(int x, int y){
        // get parent of both the x and y components.
        x = findParent(x);
        y = findParent(y);
        // if they are not same means they are belongs to diffrent components,
        // so return false.
        if(x != y) return false;

        // otherwise return true.
        return true;
    }

    public static void main(String[] args){
        // loop 0 to 10^5 + 5
        for(int i = 0; i < N; i++){
            // initilize each component(node in starting) there own parent.
            parent[i] = i;
            // initilize the size of each component as 1.
            size[i] = 1;
        }
        
    }

}
