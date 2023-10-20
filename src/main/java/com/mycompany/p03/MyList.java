package com.mycompany.p03;

public class MyList <E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private Node<E> actualNode;
    private int contador = 0;
    
    public MyList(){
        this.firstNode = null;
        this.lastNode = null;
        this.actualNode = null;
        
    }
    
    public void showMyList(){
        Node<E> temporary = this.firstNode;
        while (temporary != null){
            System.out.println(temporary.getMain());
//            System.out.println(temporary.getMain.toString());
            temporary=temporary.getNextNode();
        }
    }
    
    public void add(E p){
        
        this.contador++;
        Node<E> newNode = new Node(p,contador);
        
        //creas empleado 1 y lo añades
        
        if(firstNode == null){
            this.firstNode = newNode;
            this.lastNode = newNode;
    
        }else{
            
            lastNode.setNextNode(newNode);
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }
        this.actualNode = lastNode;
    }
    
    
    public void removeElement(){

        //no se ni como lo he hecho
        
        if(actualNode == firstNode){
            firstNode = actualNode.nextNode;
        }else if(actualNode == lastNode){
            lastNode = actualNode.previousNode;
        }else{
            actualNode.previousNode.setNextNode(actualNode.nextNode);
            actualNode.nextNode.setPreviousNode(actualNode.previousNode);
        }
           
        
    }
    
    public void nextNode(){
        this.actualNode = actualNode.previousNode;
    }
    
    public void previousNode(){
        this.actualNode = actualNode.nextNode;
    }
    
    
    public boolean isFirst(){
        return (actualNode == firstNode);
    }
    
    public boolean isLast(){
        
        return (actualNode == lastNode);
    
    }
    
    
    
    
    
    
    
    

    public Node<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node<E> firstNode) {
        this.firstNode = firstNode;
    }

    public Node<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node<E> lastNode) {
        this.lastNode = lastNode;
    }

    public Node<E> getActualNode() {
        return actualNode;
    }

    public void setActualNode(Node<E> actualNode) {
        this.actualNode = actualNode;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public MyList clonarLista(){
        MyList<E> clonedList = new MyList<>();

        Node<E> originalNode = this.firstNode;
        while (originalNode != null) {
            clonedList.add(originalNode.getMain());
            originalNode = originalNode.getNextNode();
        }

        return clonedList;
    }
    
    
    
    
// Inner class

    public class Node<E>{
        private Node<E> nextNode;
        private Node<E> previousNode;
        E main;
        int index = 1;
        
        public Node(E p, int contador){
            this.nextNode = null;
            this.main = p;
            this.index = contador;
        }
        
        public Node<E> getNextNode() {
            return this.nextNode;
        }

        public void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }

        public E getMain() {
            return main;
        }

        public void setMain(E p) {
            this.main = p;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Node<E> getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(Node<E> previousNode) {
            this.previousNode = previousNode;
        }
        
        
        
        
    }
}
