package agh.wggios.analizadanych

import agh.wggios.analizadanych.datareader.DataReader
import agh.wggios.analizadanych.datawriter.DataWriter
import agh.wggios.analizadanych.datatransform.DataTransform
import agh.wggios.analizadanych.sparksessionprovider.SparkSessionProvider

object Main {

  def main(args: Array[String]): Unit = {
    val sparksession = SparkSessionProvider.createSparkSession("app","local[*]")
    val data = DataReader.readCsv(sparksession, args(0))
    val data_transformed = DataTransform.multiplyColumn(data, args(1), 2)
    DataWriter.writeCsv(sparksession, data_transformed, args(2))
  }
}
