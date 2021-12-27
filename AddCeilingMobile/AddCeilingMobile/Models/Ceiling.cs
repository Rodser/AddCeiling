using System.Collections.Generic;
using Xamarin.Forms;
using Xamarin.Forms.Shapes;

namespace AddCeilingMobile.Models
{
    internal class Ceiling
    {
        public int Id { get; set; }
        public List<Segment> Segments { get; set; }
        public PointCollection Points => GetPoints();

        private PointCollection GetPoints()
        {
            var points = new PointCollection();
            points.Add(Point.Zero);
            foreach (var segment in Segments)
            {
                points.Add(segment.EndPoint);
            }
            return points;
        }
    }
}
