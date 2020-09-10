package com.chaochaogu.design.pattern.compose.extend.transparent;

import java.util.List;

/**
 * 树叶节点
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class Leaf extends Component {

    @Deprecated
    @Override
    public void add() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public List<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
