package com.simpleplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import com.simpleplugin.psi.SimpleNamedElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by vdahuja on 4/17/17.
 */
public  class SimpleNamedElementImpl extends ASTWrapperPsiElement implements SimpleNamedElement {
  public SimpleNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public PsiElement getNameIdentifier() {
    return null;
  }

  @Override
  public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
    return null;
  }
}
