package github.acodervic.mod.javafx;

import java.util.concurrent.TimeUnit;

import github.acodervic.mod.UtilFunInter;
import github.acodervic.mod.utilFun;
import github.acodervic.mod.thread.AsyncTaskRunnable;
import javafx.application.Platform;

public class FxAppThreadUtil  {


    /**
     *  同步运行渲染任务到javafx渲染那线程中,并等待返回
     * @param run 被运行的函数
     * @param timeoutMillis 超时时间
     */
    public static void fxRunLaterSync(Runnable run,Long timeoutMillis) {
        utilFun.nullCheck(run);
        if (Platform.isFxApplicationThread()) {
            run.run();
        }else{
            try {
                AsyncTaskRunnable asyncTask = new AsyncTaskRunnable(run);
                Platform.runLater(() -> {
                    asyncTask.executeFun();
                });
                
                if (timeoutMillis!=null && timeoutMillis>0) {
                    asyncTask.syncWaitFinish(timeoutMillis,TimeUnit.MILLISECONDS);
                }else{
                    asyncTask.syncWaitFinish();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    /**
     *  同步运行渲染任务到javafx渲染那线程中,并等待返回 永不超时
     * @param run
     */
    public static  void fxRunLaterSync(Runnable run) {
        fxRunLaterSync(run, null);
    }

    /**
     * 运行fx渲染任务
     * @param run
     */
    public static  void fxRunLater(Runnable run) {
        utilFun.nullCheck(run);
        Platform.runLater(() -> {
            run.run();
        });
    }

}
