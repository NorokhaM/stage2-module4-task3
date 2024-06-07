package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent{
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    public TextComponent(TextComponentType textComponentType) {
        super(textComponentType);
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder();
        for (AbstractTextComponent component : componentList) {
            builder.append(component.operation());
        }
        return builder.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
        size++;
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
        size--;
    }

    @Override
    public int getSize(){
        return size;
    }

}
