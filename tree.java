        class TreeSatck{
            static class node{
                int data;
                node child;
                node(int data){
                    this.data=data;
                    this.child=null;
                }
            }
            node top=null;
            void push(int value){
                node newnode=new node(value);
                newnode.child=top;
                top=newnode;
                System.out.println(value+"pushed");
            }
            int pop(){
                if (top==null){
                    System.out.println("Stack is empty");
                    return -1;
                }
                int popped=top.data;
                top=top.child;
                return popped;
            }
                int peek(){
                    if (top==null){
                        System.out.println("Satck is empty");
                        return -1;
                    }
                    return top.data;
                }
                void display(){
                    node temp=top;
                    System.out.print("Stack: ");
                    while (temp != null){
                        System.out.print(temp.data+" ");
                        temp=temp.child;
                    }
                    System.out.println();
                }
                public static void main(String[] args) {
                    TreeSatck stack =new TreeSatck();
                stack.push(10);
                stack.push(20);
                stack.push(30);
                stack.display();
                System.out.println("peek: "+stack.peek());
                System.out.println("pop: "+stack.pop());
                stack.display();
                }
        }
