/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import java.util.Arrays;
import org.eclipse.lsp4j.debug.Breakpoint;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Response to 'setFunctionBreakpoints' request.
 * <p>
 * Returned is information about each breakpoint created by this request.
 */
@SuppressWarnings("all")
public class SetFunctionBreakpointsResponse {
  /**
   * Information about the breakpoints. The array elements correspond to the elements of the 'breakpoints' array.
   */
  @NonNull
  private Breakpoint[] breakpoints;
  
  /**
   * Information about the breakpoints. The array elements correspond to the elements of the 'breakpoints' array.
   */
  @Pure
  @NonNull
  public Breakpoint[] getBreakpoints() {
    return this.breakpoints;
  }
  
  /**
   * Information about the breakpoints. The array elements correspond to the elements of the 'breakpoints' array.
   */
  public void setBreakpoints(@NonNull final Breakpoint[] breakpoints) {
    this.breakpoints = breakpoints;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("breakpoints", this.breakpoints);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SetFunctionBreakpointsResponse other = (SetFunctionBreakpointsResponse) obj;
    if (this.breakpoints == null) {
      if (other.breakpoints != null)
        return false;
    } else if (!Arrays.deepEquals(this.breakpoints, other.breakpoints))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.breakpoints== null) ? 0 : Arrays.deepHashCode(this.breakpoints));
  }
}
