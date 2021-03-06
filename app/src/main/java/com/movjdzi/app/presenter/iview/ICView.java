package com.movjdzi.app.presenter.iview;

import com.movjdzi.app.model.vo.CommentVo;

import java.util.ArrayList;

/**
 * @author huangyong
 * createTime 2019-09-21
 */
public interface ICView extends IBase {
    void loadAllDone(ArrayList<CommentVo> commentVos);

    void publishDone(CommentVo commentVo);

    void loadMoreDone(ArrayList<CommentVo> commentVos);
}
