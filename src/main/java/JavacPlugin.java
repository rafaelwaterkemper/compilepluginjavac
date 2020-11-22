import com.sun.source.util.JavacTask;
import com.sun.source.util.Plugin;
import com.sun.tools.javac.api.BasicJavacTask;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Log;

public class JavacPlugin implements Plugin {

    public String getName() {
        return "MyPlugin";
    }

    public void init(JavacTask task, String... args) {
        System.out.println("Rafael");
        Context context = ((BasicJavacTask) task).getContext();
        Log.instance(context)
                .printRawLines(Log.WriterKind.NOTICE, "Hello from " + getName());
    }

}
