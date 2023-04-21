package agh.wggios.analizadanych

import agh.wggios.analizadanych.datareader.DataReader
import agh.wggios.analizadanych.datawriter.DataWriter
import agh.wggios.analizadanych.datatransform.DataTransform
import org.apache.spark.sql.SparkSession

object Main {

  def main(args: Array[String]): Unit = {
    val sparksession = SparkSession.builder().appName("apka").master("local[*]").getOrCreate()
    val data = DataReader.readCsv(sparksession, args(0))
    val data_transformed = DataTransform.multiplyColumn(data, args(1), 2)
    DataWriter.writeCsv(sparksession, data_transformed, args(2))
  }
}
