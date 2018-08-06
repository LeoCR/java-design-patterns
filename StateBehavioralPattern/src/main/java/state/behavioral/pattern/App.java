package state.behavioral.pattern;

public class App {
    
    public static void main(String[] args) {
            Context context = new Context();
            StartState startState = new StartState();
            startState.doAction(context);

            System.out.println(context.getState().toString());

            StopState stopState = new StopState();
            stopState.doAction(context);

            System.out.println(context.getState().toString());
    }
    
}
