export default function RiskList() {
  return (
    <div className="p-6">
      <h1 className="text-2xl font-bold mb-4">Risk Items</h1>

      <table className="w-full border">
        <thead>
          <tr className="bg-gray-200">
            <th className="p-2">Title</th>
            <th className="p-2">Category</th>
            <th className="p-2">Status</th>
            <th className="p-2">Score</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td className="p-2">Sample Risk</td>
            <td className="p-2">Finance</td>
            <td className="p-2">OPEN</td>
            <td className="p-2">75</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}