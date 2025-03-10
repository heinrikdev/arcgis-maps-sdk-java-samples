/*
 * Copyright 2022 Esri.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

module com.esri.samples.viewshed_location {
  // require ArcGIS Maps SDK for Java module
  requires com.esri.arcgisruntime;

  // require JavaFX modules that the application uses
  requires javafx.graphics;
  requires javafx.controls;
  requires javafx.fxml;

  // make all @FXML annotated objects reflectively accessible to the javafx.fxml module
  opens com.esri.samples.viewshed_location to javafx.fxml;

  exports com.esri.samples.viewshed_location;
}
