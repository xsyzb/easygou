package cn.itaz.easygou.util;

/**
 * 返回至前台的json数据
 */
public class AjaxResult {
    private boolean succeed = true; //默认成功
    private String message = "操作成功"; //默认操作成功
    private Object object; //返回的前台对象

    /**
     * 使用链式编程 需要将set方法 返回的类型改为当前对象
     * 直接调用这个方法，默认就是操作成功
     * AjaxResult.me().setSucceed(false).setMessage("操作失败")
     * @return
     */
    public static AjaxResult getAjax(){
        return new AjaxResult();
    }

    /**
     * 传统的方式
     * 操作失败调用该构造方法
     * @param succeed
     * @param message
     */
    public AjaxResult(boolean succeed, String message) {
        this.succeed = false;
        this.message = message;
    }

    public AjaxResult() {
    }

    public boolean isSucceed() {
        return succeed;
    }

    public AjaxResult setSucceed(boolean succeed) {
        this.succeed = succeed;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "succeed=" + succeed +
                ", message='" + message + '\'' +
                '}';
    }
}
