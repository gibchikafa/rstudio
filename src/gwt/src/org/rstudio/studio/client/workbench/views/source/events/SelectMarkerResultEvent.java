/*
 * SelectMarkerResultEvent.java
 *
 * Copyright (C) 2009-12 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.workbench.views.source.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class SelectMarkerResultEvent extends GwtEvent<SelectMarkerResultEvent.Handler>
{
   public SelectMarkerResultEvent(int index, boolean relative)
   {
      index_ = index;
      relative_ = relative;
   }
   
   public int getIndex()
   {
      return index_;
   }
   
   public boolean isRelative()
   {
      return relative_;
   }
   
   private final int index_;
   private final boolean relative_;
   
   // Boilerplate ----
   
   public interface Handler extends EventHandler
   {
      void onSelectMarkerResult(SelectMarkerResultEvent event);
   }
   
   @Override
   public Type<Handler> getAssociatedType()
   {
      return TYPE;
   }

   @Override
   protected void dispatch(Handler handler)
   {
      handler.onSelectMarkerResult(this);
   }

   public static final Type<Handler> TYPE = new Type<Handler>();
}
