/**
 * Created by sun on 2019/2/15 16:24
 */

var baseUtils = {
    //判断表单元素的值是否为空
    isEmpty : function (item) {
        if (item.val() == '' || item.val() == undefined) {
            return true;
        }
        return false;
    },
    //1:成功 2:错误 3：疑问 4：锁定 5：哭脸，6：笑脸 7：警告
    tip: function (msg, icon, time) {
        layer.msg(msg, {icon: icon, time: time});
    }






}